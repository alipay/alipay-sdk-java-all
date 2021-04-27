package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 双联二阶段
 *
 * @author auto create
 * @since 1.0, 2020-08-20 11:40:11
 */
public class AlipayUserTwostageIndirectUseModel extends AlipayObject {

	private static final long serialVersionUID = 4378871477886292811L;

	/**
	 * 商户扫描用户的付款码值。18~24位，25~30开头，例如28开头的18位的数字；或人脸支付的ftoken等。
	 */
	@ApiField("dynamic_id")
	private String dynamicId;

	/**
	 * 进件信息中，SMID对应的银行机构的PID信息，一般为2088开头的16位数字。
	 */
	@ApiField("org_pid")
	private String orgPid;

	/**
	 * 进件信息中，二级商户ID（ sub_merchant_id)信息，一般为2088开头的16位数字。
	 */
	@ApiField("pay_smid")
	private String paySmid;

	/**
	 * 外部业务号，用于标识这笔解码请求，对同一个码的重复解码请求，sence_no必须与上一次保持一致，每次请求的sence_no必须不一样，如alipay.user.twostage.common.use接口配合alipay.trade.pay（统一收单交易支付接口）一并使用时，alipay.trade.pay接口的extend_params属性中必须设置DYNAMIC_TOKEN_OUT_BIZ_NO，且值必须与sence_no保持一致
	 */
	@ApiField("sence_no")
	private String senceNo;

	/**
	 * 进件信息中，SMID对应渠道的PID信息，一般为2088开头的16位数字。
	 */
	@ApiField("source_pid")
	private String sourcePid;

	public String getDynamicId() {
		return this.dynamicId;
	}
	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getOrgPid() {
		return this.orgPid;
	}
	public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
	}

	public String getPaySmid() {
		return this.paySmid;
	}
	public void setPaySmid(String paySmid) {
		this.paySmid = paySmid;
	}

	public String getSenceNo() {
		return this.senceNo;
	}
	public void setSenceNo(String senceNo) {
		this.senceNo = senceNo;
	}

	public String getSourcePid() {
		return this.sourcePid;
	}
	public void setSourcePid(String sourcePid) {
		this.sourcePid = sourcePid;
	}

}
