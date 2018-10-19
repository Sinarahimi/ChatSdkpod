package com.fanap.podchat.chat;

import com.fanap.podchat.model.ChatResponse;
import com.fanap.podchat.model.ErrorOutPut;
import com.fanap.podchat.model.FileImageUpload;
import com.fanap.podchat.model.OutPutAddParticipant;
import com.fanap.podchat.model.OutPutBlock;
import com.fanap.podchat.model.OutPutBlockList;
import com.fanap.podchat.model.OutPutContact;
import com.fanap.podchat.model.OutPutDeleteMessage;
import com.fanap.podchat.model.OutPutLeaveThread;
import com.fanap.podchat.model.OutPutMapNeshan;
import com.fanap.podchat.model.OutPutMute;
import com.fanap.podchat.model.OutPutNewMessage;
import com.fanap.podchat.model.OutPutParticipant;
import com.fanap.podchat.model.OutPutThread;
import com.fanap.podchat.model.OutPutUserInfo;
import com.fanap.podchat.model.ResultThreads;
import com.fanap.podchat.model.ResultHistory;

public class ChatAdapter implements ChatListener {
    @Override
    public void onDeliver(String content, long threadId) {

    }

    @Override
    public void onError(String content,ErrorOutPut errorOutPut) {
    }

    @Override
    public void onGetContacts(String contentm, OutPutContact outPutContact) {

    }

    @Override
    public void onGetHistory(String content, ChatResponse<ResultHistory> history) {

    }

    @Override
    public void onGetThread(String content, ChatResponse<ResultThreads> thread) {

    }

    @Override
    public void onThreadInfoUpdated(String content) {

    }

    @Override
    public void onBlock(String content,OutPutBlock outPutBlock) {

    }

    @Override
    public void onUnBlock(String content,OutPutBlock outPutBlock) {

    }

    @Override
    public void onSeen(String content, long threadId) {

    }

    @Override
    public void onMuteThread(String content, OutPutMute outPutMute) {

    }

    @Override
    public void onUnmuteThread(String content, OutPutMute outPutUnMute) {

    }

    @Override
    public void onUserInfo(String content, OutPutUserInfo outPutUserInfo) {

    }

    @Override
    public void onSent(String content) {

    }

    @Override
    public void onCreateThread(String content, OutPutThread outPutThread) {

    }

    @Override
    public void onGetThreadParticipant(String content, OutPutParticipant outPutParticipant) {

    }

    @Override
    public void onEditedMessage(String content) {

    }

    @Override
    public void onContactAdded(String content) {

    }

    @Override
    public void handleCallbackError(Throwable cause) throws Exception {

    }

    @Override
    public void onRemoveContact(String content) {

    }

    @Override
    public void onRenameThread(String content, OutPutThread outPutThread) {

    }

    @Override
    public void onMapSearch(String content, OutPutMapNeshan outPutMapNeshan) {

    }

    @Override
    public void onMapRouting(String content) {

    }

    @Override
    public void onNewMessage(String content,OutPutNewMessage outPutNewMessage) {

    }

    @Override
    public void onDeleteMessage(String content, OutPutDeleteMessage outPutDeleteMessage) {

    }

    @Override
    public void onUpdateContact(String content) {

    }

    @Override
    public void onUploadFile(String content) {

    }

    @Override
    public void onUploadImageFile(String content, FileImageUpload fileImageUpload) {

    }

    @Override
    public void onSyncContact(String content) {

    }

    @Override
    public void onThreadAddParticipant(String content, OutPutAddParticipant outPutAddParticipant) {

    }

    @Override
    public void onThreadRemoveParticipant(String content, OutPutParticipant outPutParticipant) {

    }

    @Override
    public void onThreadLeaveParticipant(String content, OutPutLeaveThread outPutLeaveThread) {

    }

    @Override
    public void onLastSeenUpdated(String content) {

    }

    @Override
    public void onChatState(String state) {

    }

    @Override
    public void onGetBlockList(String content,OutPutBlockList outPutBlockList) {

    }

    @Override
    public void onSearchContact(String content) {

    }
}
