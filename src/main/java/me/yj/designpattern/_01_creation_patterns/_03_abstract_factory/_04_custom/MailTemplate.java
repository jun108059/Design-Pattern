package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.HashMap;
import java.util.Map;

public abstract class MailTemplate {
    public Map<String, String> template = new HashMap<>();

    /**
     * 발신자 Setting
     * @param sender 수신자
     */
    public void setSender(String sender) {
        template.put("sender", sender);
    }

    /**
     * 수신자 Setting
     * @param receiver 발신자
     */
    public void setReceiver(String receiver) {
        template.put("receiver", receiver);
    }

    /**
     * 하단 Footer Setting
     * @param footer 하단 내용
     */
    public void setFooter(String footer) {
        template.put("footer", footer);
    }

    /**
     * 메일 내용 Setting
     * @param content 메일 내용
     */
    protected abstract void setContent(String content);
}
