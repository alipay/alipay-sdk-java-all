package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall库存变化信息同步
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:54:28
 */
public class AlipayMerchantMrchsurplmitemCannotsellSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1893674439429525919L;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 通知时间
	 */
	@ApiField("notice_time")
	private Long noticeTime;

	/**
	 * 通知类型
TB_ZERO_INVENTORY：淘宝库存为0
LM_ZERO_INVENTORY：lm限购库存为0
	 */
	@ApiField("notice_type")
	private String noticeType;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 子渠道ID
	 */
	@ApiField("sub_biz_id")
	private String subBizId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getNoticeTime() {
		return this.noticeTime;
	}
	public void setNoticeTime(Long noticeTime) {
		this.noticeTime = noticeTime;
	}

	public String getNoticeType() {
		return this.noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSubBizId() {
		return this.subBizId;
	}
	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
	}

}
