package com.dubbo.learn.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class BillnoSn {
    private String billnosnSeq;

    private String sn;

    private String channelid;

    private String bankSendSn;

    private String tranDate;

    private String channelBatchno;

    private String channelDetail;

    private String bankRecvSn;

    private String tranType;

    private String state;

    private String batchid;

    private String detailid;

    private String channelRtncode;

    private String channelRtnnote;

    private Date sendTime;

    private Date recvTime;

    private BigDecimal actualAmount;

    private String corpacctno;

    private String corpbankno;

    private String checkDate;

    private String corpacctname;

    private String otheracctno;

    private String otheracctname;

    private String otherbankno;

    private String feecode;

    private String feedesc;

    private String orderid;

    private String othercustId;

    private String otherbankaddrno;

    private String srccustId;

    private String bankType;

    private String checkState;

    private String bankDate;

    private String creditbatchno;

    private String validdate;

    private String timeOutFlag;

    private String payState;

    private BigDecimal bankHandlingFee;

    private String bankCardType;

    private String bankMerchantId;

    private BigDecimal amount;

    private String poolMerchantId;

    private String bankPaySn;

    public String getBillnosnSeq() {
        return billnosnSeq;
    }

    public void setBillnosnSeq(String billnosnSeq) {
        this.billnosnSeq = billnosnSeq == null ? null : billnosnSeq.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getBankSendSn() {
        return bankSendSn;
    }

    public void setBankSendSn(String bankSendSn) {
        this.bankSendSn = bankSendSn == null ? null : bankSendSn.trim();
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate == null ? null : tranDate.trim();
    }

    public String getChannelBatchno() {
        return channelBatchno;
    }

    public void setChannelBatchno(String channelBatchno) {
        this.channelBatchno = channelBatchno == null ? null : channelBatchno.trim();
    }

    public String getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(String channelDetail) {
        this.channelDetail = channelDetail == null ? null : channelDetail.trim();
    }

    public String getBankRecvSn() {
        return bankRecvSn;
    }

    public void setBankRecvSn(String bankRecvSn) {
        this.bankRecvSn = bankRecvSn == null ? null : bankRecvSn.trim();
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid == null ? null : batchid.trim();
    }

    public String getDetailid() {
        return detailid;
    }

    public void setDetailid(String detailid) {
        this.detailid = detailid == null ? null : detailid.trim();
    }

    public String getChannelRtncode() {
        return channelRtncode;
    }

    public void setChannelRtncode(String channelRtncode) {
        this.channelRtncode = channelRtncode == null ? null : channelRtncode.trim();
    }

    public String getChannelRtnnote() {
        return channelRtnnote;
    }

    public void setChannelRtnnote(String channelRtnnote) {
        this.channelRtnnote = channelRtnnote == null ? null : channelRtnnote.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getRecvTime() {
        return recvTime;
    }

    public void setRecvTime(Date recvTime) {
        this.recvTime = recvTime;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getCorpacctno() {
        return corpacctno;
    }

    public void setCorpacctno(String corpacctno) {
        this.corpacctno = corpacctno == null ? null : corpacctno.trim();
    }

    public String getCorpbankno() {
        return corpbankno;
    }

    public void setCorpbankno(String corpbankno) {
        this.corpbankno = corpbankno == null ? null : corpbankno.trim();
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    public String getCorpacctname() {
        return corpacctname;
    }

    public void setCorpacctname(String corpacctname) {
        this.corpacctname = corpacctname == null ? null : corpacctname.trim();
    }

    public String getOtheracctno() {
        return otheracctno;
    }

    public void setOtheracctno(String otheracctno) {
        this.otheracctno = otheracctno == null ? null : otheracctno.trim();
    }

    public String getOtheracctname() {
        return otheracctname;
    }

    public void setOtheracctname(String otheracctname) {
        this.otheracctname = otheracctname == null ? null : otheracctname.trim();
    }

    public String getOtherbankno() {
        return otherbankno;
    }

    public void setOtherbankno(String otherbankno) {
        this.otherbankno = otherbankno == null ? null : otherbankno.trim();
    }

    public String getFeecode() {
        return feecode;
    }

    public void setFeecode(String feecode) {
        this.feecode = feecode == null ? null : feecode.trim();
    }

    public String getFeedesc() {
        return feedesc;
    }

    public void setFeedesc(String feedesc) {
        this.feedesc = feedesc == null ? null : feedesc.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOthercustId() {
        return othercustId;
    }

    public void setOthercustId(String othercustId) {
        this.othercustId = othercustId == null ? null : othercustId.trim();
    }

    public String getOtherbankaddrno() {
        return otherbankaddrno;
    }

    public void setOtherbankaddrno(String otherbankaddrno) {
        this.otherbankaddrno = otherbankaddrno == null ? null : otherbankaddrno.trim();
    }

    public String getSrccustId() {
        return srccustId;
    }

    public void setSrccustId(String srccustId) {
        this.srccustId = srccustId == null ? null : srccustId.trim();
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState == null ? null : checkState.trim();
    }

    public String getBankDate() {
        return bankDate;
    }

    public void setBankDate(String bankDate) {
        this.bankDate = bankDate == null ? null : bankDate.trim();
    }

    public String getCreditbatchno() {
        return creditbatchno;
    }

    public void setCreditbatchno(String creditbatchno) {
        this.creditbatchno = creditbatchno == null ? null : creditbatchno.trim();
    }

    public String getValiddate() {
        return validdate;
    }

    public void setValiddate(String validdate) {
        this.validdate = validdate == null ? null : validdate.trim();
    }

    public String getTimeOutFlag() {
        return timeOutFlag;
    }

    public void setTimeOutFlag(String timeOutFlag) {
        this.timeOutFlag = timeOutFlag == null ? null : timeOutFlag.trim();
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }

    public BigDecimal getBankHandlingFee() {
        return bankHandlingFee;
    }

    public void setBankHandlingFee(BigDecimal bankHandlingFee) {
        this.bankHandlingFee = bankHandlingFee;
    }

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    public String getBankMerchantId() {
        return bankMerchantId;
    }

    public void setBankMerchantId(String bankMerchantId) {
        this.bankMerchantId = bankMerchantId == null ? null : bankMerchantId.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPoolMerchantId() {
        return poolMerchantId;
    }

    public void setPoolMerchantId(String poolMerchantId) {
        this.poolMerchantId = poolMerchantId == null ? null : poolMerchantId.trim();
    }

    public String getBankPaySn() {
        return bankPaySn;
    }

    public void setBankPaySn(String bankPaySn) {
        this.bankPaySn = bankPaySn == null ? null : bankPaySn.trim();
    }
}