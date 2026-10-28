package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企微会话信息同步
 *
 * @author auto create
 * @since 1.0, 2026-10-27 15:04:49
 */
public class CsoMinigameMinigamebaseWechatMessageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6682461185193521374L;

	/**
	 * {"corpId":"企业微信的企业id","groupSend":"是否群发","messageType":"消息类型：0-普通消息，1-命令消息，2-通知消息","msgId":"企微存档消息id","msgTimestamp":"消息时间戳(毫秒)","receiverId":"接收方id，单聊取toList[0]，群聊为空（会话存档场景下为客服坐席id）","receiverType":"接收方类型：visitor-访客/客户，server-客服/坐席","senderId":"发送方id（客户为企微外部联系人密文id）","senderType":"发送方类型：visitor-访客/客户，server-客服/坐席","seq":"存档位序号，严格递增，供下游幂等去重","sessionId":"IM会话id，发布时由message.getSid回填","templateCode":"消息模板码/消息类型，示例中：1-文本，2-图片","text":"文本正文，仅文本类消息有值","type":"消息子类型：text-文本，image-图片等","roomId":"群聊会话id，单聊为空","mediaMd5sum":"媒体文件md5引用，不含二进制，仅媒体类消息有值","sdkFileId":"媒体存档文件id，不含二进制，仅媒体类消息有值","resourceType":"媒体资源类型：IMAGE-图片，FILE-文件，VIDEO-视频，VOICE-语音","url":"媒体文件的下载链接，仅媒体类消息有值"}
	 */
	@ApiField("data")
	private String data;

	/**
	 * 环境id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 时间戳
	 */
	@ApiField("event_timestamp")
	private Long eventTimestamp;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 应用id
	 */
	@ApiField("im_app_id")
	private String imAppId;

	/**
	 * source
	 */
	@ApiField("source")
	private String source;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * type
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public Long getEventTimestamp() {
		return this.eventTimestamp;
	}
	public void setEventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getImAppId() {
		return this.imAppId;
	}
	public void setImAppId(String imAppId) {
		this.imAppId = imAppId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
