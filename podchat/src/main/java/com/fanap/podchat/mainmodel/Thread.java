package com.fanap.podchat.mainmodel;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.fanap.podchat.util.DataTypeConverter;

import java.util.List;

@Entity
public class Thread  {
    @PrimaryKey
    private long id;
    private long joinDate;
    @Embedded
    private Inviter inviter;
    @Embedded
    private LastMessageVO lastMessageVO;
    @ColumnInfo(name = "thread_title")
    private String title;
    @TypeConverters(DataTypeConverter.class)
    private List<Participant> participants;
    private long time;
    private String lastMessage;
    private String lastParticipantName;
    private String lastParticipantImage;
    private boolean group;
    private long partner;
    @ColumnInfo(name = "thread_image")
    private String image;
    private long unreadCount;
    private long lastSeenMessageId;
    private long partnerLastMessageId;
    private long partnerLastSeenMessageId;
    private long partnerLastDeliveredMessageId;
    private int type;
    private boolean mute;
    private String metadata;
    private boolean canEditInfo;
    private long participantCount;
    private Boolean canSpam;
    private Boolean admin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getLastParticipantName() {
        return lastParticipantName;
    }

    public void setLastParticipantName(String lastParticipantName) {
        this.lastParticipantName = lastParticipantName;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public long getPartner() {
        return partner;
    }

    public void setPartner(long partner) {
        this.partner = partner;
    }

    public long getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(long unreadCount) {
        this.unreadCount = unreadCount;
    }

    public long getLastSeenMessageId() {
        return lastSeenMessageId;
    }

    public void setLastSeenMessageId(long lastSeenMessageId) {
        this.lastSeenMessageId = lastSeenMessageId;
    }

    public long getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(long joinDate) {
        this.joinDate = joinDate;
    }

    public Inviter getInviter() {
        return inviter;
    }

    public void setInviter(Inviter inviter) {
        this.inviter = inviter;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LastMessageVO getLastMessageVO() {
        return lastMessageVO;
    }

    public void setLastMessageVO(LastMessageVO lastMessageVO) {
        this.lastMessageVO = lastMessageVO;
    }

    public long getPartnerLastMessageId() {
        return partnerLastMessageId;
    }

    public void setPartnerLastMessageId(long partnerLastMessageId) {
        this.partnerLastMessageId = partnerLastMessageId;
    }

    public long getPartnerLastDeliveredMessageId() {
        return partnerLastDeliveredMessageId;
    }

    public void setPartnerLastDeliveredMessageId(long partnerLastDeliveredMessageId) {
        this.partnerLastDeliveredMessageId = partnerLastDeliveredMessageId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }

    public long getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(long participantCount) {
        this.participantCount = participantCount;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public boolean isCanEditInfo() {
        return canEditInfo;
    }

    public void setCanEditInfo(boolean canEditInfo) {
        this.canEditInfo = canEditInfo;
    }

    public long getPartnerLastSeenMessageId() {
        return partnerLastSeenMessageId;
    }

    public void setPartnerLastSeenMessageId(long partnerLastSeenMessageId) {
        this.partnerLastSeenMessageId = partnerLastSeenMessageId;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getLastParticipantImage() {
        return lastParticipantImage;
    }

    public void setLastParticipantImage(String lastParticipantImage) {
        this.lastParticipantImage = lastParticipantImage;
    }

    public Boolean getCanSpam() {
        return canSpam;
    }

    public void setCanSpam(Boolean canSpam) {
        this.canSpam = canSpam;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
