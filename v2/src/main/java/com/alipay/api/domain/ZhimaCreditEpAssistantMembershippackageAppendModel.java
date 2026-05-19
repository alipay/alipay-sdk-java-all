package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手会员包追加许可证
 *
 * @author auto create
 * @since 1.0, 2026-04-02 11:52:44
 */
public class ZhimaCreditEpAssistantMembershippackageAppendModel extends AlipayObject {

	private static final long serialVersionUID = 2765285487476518634L;

	/**
	 * 在当前会员包中增购的license数量
	 */
	@ApiField("license_num")
	private Long licenseNum;

	/**
	 * 订单编号，是指伙伴的正式向企信提交订单后，拿到的一个唯一的不重复订单号，届时伙伴的财务同学打款时需要附上该订单号，方便做资金流和订单的匹配
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务ID,在调用本接口中需要保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 创建会员包返回的会员包编码
	 */
	@ApiField("package_id")
	private String packageId;

	public Long getLicenseNum() {
		return this.licenseNum;
	}
	public void setLicenseNum(Long licenseNum) {
		this.licenseNum = licenseNum;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

}
