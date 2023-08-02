package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增/修改商家
 *
 * @author auto create
 * @since 1.0, 2021-09-27 14:23:22
 */
public class AlipayDataDataserviceAdPrincipalCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 7679781223872762277L;

	/**
	 * 商家支付宝PID，新增商家时必填
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 商家的全量资质列表，用于商家资质资质审核
	 */
	@ApiListField("attachment_list")
	@ApiField("outer_attachment")
	private List<OuterAttachment> attachmentList;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商家id，修改商家时必填
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 二级行业ID
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 投放账户id，新增商家时必填
	 */
	@ApiField("user_id")
	private Long userId;

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public List<OuterAttachment> getAttachmentList() {
		return this.attachmentList;
	}
	public void setAttachmentList(List<OuterAttachment> attachmentList) {
		this.attachmentList = attachmentList;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
