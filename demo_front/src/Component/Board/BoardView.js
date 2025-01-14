import React, { useEffect, useState } from 'react'
import { CustomAxios } from '../CustomAxios'
import CommentWrite from '../Form/CommentWrite'
import CommentView from './CommentView'
import LikeButton from './LikeButton'
import BoardEditModal from '../Form/BoardEditModal'
import BoardDeleteModal from '../Form/BoardDeleteModal'
import DOMPurifying from '../Util/DOMPurifying'
import FileDropdown from './FileDropdown'

const BoardView = ({ boardIdx }) => {

    const [data, setData] = useState('');
    const [commentState, setcommentState] = useState(0);

    useEffect(() => {
        fetchData(boardIdx);
    }, [boardIdx])

    const fetchData = async (idx) => {
        try {
            await CustomAxios({
                methodType: 'get',
                backendURL: `board/view/${idx}`,
                onResponse: handleResponse,
            });
        } catch (error) {
            // alert(error.response.data);
        }
    }

    const handleResponse = (response) => {
        setData(response);
    };

    // 댓글 등록/수정/삭제 시 재렌더링용 카운트 -> 하위 컴포넌트에 전달하여 재렌더링
    const handleCommentState = () => {
        setcommentState((prevCount) => prevCount + 1);
    }

    return (
        <div className='flex justify-center items-center pt-5'>
            {data &&
                <div className="flex flex-col bg-gray-300 rounded-lg w-full md:w-2/3 max-w-screen-xl">
                    <div className="mt-3 mx-3 min-w-screen font-bold text-2xl break-words">
                        {data.title}
                    </div>
                    <div className="text-right mx-3">
                        {data.nickname}
                    </div>
                    <h6 className="text-gray-500 text-right mx-3 text-sm">
                        {new Date(data.writtenDate).toLocaleString()}
                    </h6>
                    <div className="min-w-screen mx-3 border-t-2 my-2 border-gray-500" />
                    <div className="text-lg text-start mx-3 mb-3 break-words"
                        dangerouslySetInnerHTML={{
                            __html: DOMPurifying(data.content)
                        }}>
                    </div>
                    {data.hasImage ? (
                        <div>
                            <FileDropdown boardIdx={boardIdx} />
                        </div>
                    ) : null}

                    <div className="flex justify-end items-end mx-3 mb-3">
                        <LikeButton boardIdx={data.idx} likeCnt={data.likeCnt}></LikeButton>
                    </div>
                    {data.nickname === sessionStorage.getItem("user") || sessionStorage.getItem("CheckAdmin") === 'X' ?
                        <div className='flex justify-end mx-2 gap-2'>
                            <BoardEditModal
                                title={data.title}
                                content={data.content}
                                boardIdx={boardIdx} />
                            <BoardDeleteModal
                                boardIdx={boardIdx}
                                nickname={data.nickname} />
                        </div>
                        : null}
                    {/* <div className="min-w-screen mx-3 border-t-2 mb-2 border-gray-500" /> */}
                    <div className='mx-3 min-w-screen'>
                        <CommentView
                            boardIdx={boardIdx}
                            commentState={commentState}
                            onCommentWritten={handleCommentState} />
                        <CommentWrite
                            boardIdx={boardIdx}
                            commentState={commentState}
                            onCommentWritten={handleCommentState} />
                    </div>
                </div>
            }
        </div >
    )
}

export default BoardView
