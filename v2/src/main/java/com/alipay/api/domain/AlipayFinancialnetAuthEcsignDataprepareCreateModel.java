package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约数据录入准备服务
 *
 * @author auto create
 * @since 1.0, 2022-11-02 13:23:15
 */
public class AlipayFinancialnetAuthEcsignDataprepareCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8163564756641491186L;

	/**
	 * 签约回跳类型
	 */
	@ApiField("back_type")
	private String backType;

	/**
	 * 签约结束回跳地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 签约时所需要的数据信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 跳转类型
	 */
	@ApiField("jump_type")
	private String jumpType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 签约产品码
	 */
	@ApiField("sign_product_id")
	private String signProductId;

	/**
	 * 签约方案码
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 回跳地址
	 */
	@ApiField("third_part_schema")
	private String thirdPartSchema;

	public String getBackType() {
		return this.backType;
	}
	public void setBackType(String backType) {
		this.backType = backType;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getJumpType() {
		return this.jumpType;
	}
	public void setJumpType(String jumpType) {
		this.jumpType = jumpType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSignProductId() {
		return this.signProductId;
	}
	public void setSignProductId(String signProductId) {
		this.signProductId = signProductId;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public String getThirdPartSchema() {
		return this.thirdPartSchema;
	}
	public void setThirdPartSchema(String thirdPartSchema) {
		this.thirdPartSchema = thirdPartSchema;
	}

}
