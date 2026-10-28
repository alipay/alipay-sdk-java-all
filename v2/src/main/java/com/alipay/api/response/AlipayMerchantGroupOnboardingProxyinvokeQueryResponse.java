package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.onboarding.proxyinvoke.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-17 19:37:54
 */
public class AlipayMerchantGroupOnboardingProxyinvokeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5695637147277934141L;

	/** 
	 * 商家确认授权且令牌生成后有值，不等迈进完成
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	/** 
	 * 授权方（商家侧）应用appid，与app_auth_token同时出现
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 商家扫码进入待办确认授权的二维码跳转链接，商家确认中阶段有值
	 */
	@ApiField("confirm_qr_code")
	private String confirmQrCode;

	/** 
	 * 商家确认二维码的图片地址，商家确认中阶段有值
	 */
	@ApiField("confirm_qr_code_img_url")
	private String confirmQrCodeImgUrl;

	/** 
	 * 商家在网页端确认授权的链接，商家确认中阶段有值
	 */
	@ApiField("confirm_web_link")
	private String confirmWebLink;

	/** 
	 * 仅status=FAILED时有。PARAM_CHECK_FAILED-线索或商家复核失败；LEADS_AUDIT_REJECTED-线索审核驳回；PROXY_INVOKE_FAILED-商家代调用校验失败；MERCHANT_REJECTED-商家拒绝或确认超时
	 */
	@ApiField("fail_code")
	private String failCode;

	/** 
	 * 仅status=FAILED时有，可直接展示
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 申请状态最后变更时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 服务商主体PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * 神券分配给服务商的线索ID
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 待迈进商家的支付宝PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 当前所处节点。PROXY_INVOKING-商家代调用发起中；MERCHANT_CONFIRMING-商家确认中；STORE_CLAIMING-门店认领中；LEADS_AUDITING-线索审核中；COMPLETED-迈进完成；FAILED-流程中断
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 服务商侧业务标识，发起时传入，原样回传
	 */
	@ApiField("unique_biz_id")
	private String uniqueBizId;

	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}
	public String getAppAuthToken( ) {
		return this.appAuthToken;
	}

	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}
	public String getAuthAppId( ) {
		return this.authAppId;
	}

	public void setConfirmQrCode(String confirmQrCode) {
		this.confirmQrCode = confirmQrCode;
	}
	public String getConfirmQrCode( ) {
		return this.confirmQrCode;
	}

	public void setConfirmQrCodeImgUrl(String confirmQrCodeImgUrl) {
		this.confirmQrCodeImgUrl = confirmQrCodeImgUrl;
	}
	public String getConfirmQrCodeImgUrl( ) {
		return this.confirmQrCodeImgUrl;
	}

	public void setConfirmWebLink(String confirmWebLink) {
		this.confirmWebLink = confirmWebLink;
	}
	public String getConfirmWebLink( ) {
		return this.confirmWebLink;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}
	public String getFailCode( ) {
		return this.failCode;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}
	public String getIsvPid( ) {
		return this.isvPid;
	}

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUniqueBizId(String uniqueBizId) {
		this.uniqueBizId = uniqueBizId;
	}
	public String getUniqueBizId( ) {
		return this.uniqueBizId;
	}

}
