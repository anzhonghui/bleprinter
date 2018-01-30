package com.cat.bleprinter.util;

/**
 * Created by AN on 2018/1/24.
 */

public class SendMsgUtil {
    //指令名称
    private String cmdName;
    //发送的报文
    private byte[] sendBytes;
    //按钮是否点击过
    private boolean isClick;
    //应答状态，0：未应答，1：应答成功；2：应答失败
    private int answerState;

    public SendMsgUtil(){
    }

    public SendMsgUtil(String cmdName, byte[] sendBytes, boolean isClick, int answerState) {
        this.cmdName = cmdName;
        this.sendBytes = sendBytes;
        this.isClick = isClick;
        this.answerState = answerState;
    }

    @Override
    public String toString() {
        return "SendMsgUtil{" +
                "cmdName='" + cmdName + '\'' +
                ", sendBytes=" + ProtocolUtil.bytes2HexString(sendBytes) +
                ", isClick=" + isClick +
                ", answerState=" + answerState +
                '}';
    }

    public void setCmdName(String cmdName) {
        this.cmdName = cmdName;
    }

    public String getCmdName() {

        return cmdName;
    }

    public void setSendBytes(byte[] sendBytes) {
        this.sendBytes = sendBytes;
    }

    public void setClick(boolean click) {
        isClick = click;
    }

    public void setAnswerState(int answerState) {
        this.answerState = answerState;
    }

    public byte[] getSendBytes() {

        return sendBytes;
    }

    public boolean isClick() {
        return isClick;
    }

    public int getAnswerState() {
        return answerState;
    }
}
