package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步凭证核销状态
 *
 * @author auto create
 * @since 1.0, 2023-11-13 10:54:53
 */
public class AlipayMarketingCertificateCertificationUseModel extends AlipayObject {

	private static final long serialVersionUID = 8823588254724426754L;

	/**
	 * 核销时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 凭证核销详情
	 */
	@ApiListField("certificate_use_info_list")
	@ApiField("certificate_use_info")
	private List<CertificateUseInfo> certificateUseInfoList;

	/**
	 * 待核销的三方码。取值为支付宝调用三方凭证发放spi时商户返回的三方码 当前字段已废弃(核销接口允许批量传入)
	 */
	@ApiField("code")
	@Deprecated
	private String code;

	/**
	 * 凭证归属支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 购买商品的订单id。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商家侧核销对应的交易订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 核销门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 凭证归属支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public List<CertificateUseInfo> getCertificateUseInfoList() {
		return this.certificateUseInfoList;
	}
	public void setCertificateUseInfoList(List<CertificateUseInfo> certificateUseInfoList) {
		this.certificateUseInfoList = certificateUseInfoList;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
