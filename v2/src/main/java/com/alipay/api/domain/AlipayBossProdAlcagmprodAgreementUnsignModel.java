package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 法务c端用户协议解约
 *
 * @author auto create
 * @since 1.0, 2022-11-23 10:09:14
 */
public class AlipayBossProdAlcagmprodAgreementUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 3139128563935128374L;

	/**
	 * 法务C端协议分配的协议ID，用于唯一标识一个协议或复用协议。支持列表(批量签约)
	 */
	@ApiListField("agreement_id_list")
	@ApiField("string")
	private List<String> agreementIdList;

	/**
	 * 解约日期，yyyy-MM-dd HH:mm:ss.
	 */
	@ApiField("cancel_date")
	private String cancelDate;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 一般是户号/订单号/2088等；
1、签约与解约保持一致；
2、与离线口径的签约Id保持一致；
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

	/**
	 * 产品码（产品星球）
	 */
	@ApiField("product_cd")
	private String productCd;

	/**
	 * 来源系统名，即发起调用的系统英文名称
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 本次请求流水号，用于幂等 (幂等机制：user_id + product_cd + out_sign_no + request_no + agreement_id_list唯一确定)
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getAgreementIdList() {
		return this.agreementIdList;
	}
	public void setAgreementIdList(List<String> agreementIdList) {
		this.agreementIdList = agreementIdList;
	}

	public String getCancelDate() {
		return this.cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutSignNo() {
		return this.outSignNo;
	}
	public void setOutSignNo(String outSignNo) {
		this.outSignNo = outSignNo;
	}

	public String getProductCd() {
		return this.productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
