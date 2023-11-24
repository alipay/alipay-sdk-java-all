package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.code.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-29 14:45:32
 */
public class AlipayMobileCodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1662571213369457167L;

	/** 
	 * 业务关联ID。比如订单号,userId，业务连接等
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/** 
	 * 类似产品名称，根据该值决定码存储类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 码值的状态，
init:初始
normal:正常
pause:暂停
stop:停止
	 */
	@ApiField("code_status")
	private String codeStatus;

	/** 
	 * 业务自定义json字符串。
	 */
	@ApiField("context_str")
	private String contextStr;

	/** 
	 * 动态生成图片地址
	 */
	@ApiField("dynamic_img_url")
	private String dynamicImgUrl;

	/** 
	 * 编码失效时间(yyyy-MM-dd hh:mm:ss)
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * 如果是true，则扫一扫下发跳转地址直接取自BizLinkedId
否则，从路由信息里取跳转地址
	 */
	@ApiField("is_direct")
	private String isDirect;

	/** 
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 业务用到的码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 原始码值
	 */
	@ApiField("qr_token")
	private String qrToken;

	/** 
	 * 发码来源，业务自定
	 */
	@ApiField("source_id")
	private String sourceId;

	/** 
	 * 编码启动时间(yyyy-MM-dd hh:mm:ss)
	 */
	@ApiField("start_date")
	private String startDate;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}
	public String getBizLinkedId( ) {
		return this.bizLinkedId;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}
	public String getCodeStatus( ) {
		return this.codeStatus;
	}

	public void setContextStr(String contextStr) {
		this.contextStr = contextStr;
	}
	public String getContextStr( ) {
		return this.contextStr;
	}

	public void setDynamicImgUrl(String dynamicImgUrl) {
		this.dynamicImgUrl = dynamicImgUrl;
	}
	public String getDynamicImgUrl( ) {
		return this.dynamicImgUrl;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getExpireDate( ) {
		return this.expireDate;
	}

	public void setIsDirect(String isDirect) {
		this.isDirect = isDirect;
	}
	public String getIsDirect( ) {
		return this.isDirect;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setQrToken(String qrToken) {
		this.qrToken = qrToken;
	}
	public String getQrToken( ) {
		return this.qrToken;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceId( ) {
		return this.sourceId;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
