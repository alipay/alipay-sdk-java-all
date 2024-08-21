package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificatePrepareInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.certificate.certification.prepareuse response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:51:00
 */
public class AlipayMarketingCertificateCertificationPrepareuseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1689487516726469631L;

	/** 
	 * 凭证信息列表
	 */
	@ApiListField("certificate_prepare_info_list")
	@ApiField("certificate_prepare_info")
	private List<CertificatePrepareInfo> certificatePrepareInfoList;

	/** 
	 * 凭证归属支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 购买商品的订单id，核销接口使用
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 凭证归属支付宝用户id，核销接口使用
	 */
	@ApiField("user_id")
	private String userId;

	public void setCertificatePrepareInfoList(List<CertificatePrepareInfo> certificatePrepareInfoList) {
		this.certificatePrepareInfoList = certificatePrepareInfoList;
	}
	public List<CertificatePrepareInfo> getCertificatePrepareInfoList( ) {
		return this.certificatePrepareInfoList;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
