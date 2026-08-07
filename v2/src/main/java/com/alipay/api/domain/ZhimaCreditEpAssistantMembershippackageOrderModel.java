package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企信助手会员包提前续约
 *
 * @author auto create
 * @since 1.0, 2026-07-27 14:12:53
 */
public class ZhimaCreditEpAssistantMembershippackageOrderModel extends AlipayObject {

	private static final long serialVersionUID = 6697393382496252673L;

	/**
	 * 续约时长数量，其单位依赖于duration_unit表示的单位类型，如 duration_unit=HALF_YEAR，duration_quantity=3 则表示一年半
	 */
	@ApiField("duration_quantity")
	private Long durationQuantity;

	/**
	 * 购买会员包的时长单位(目前支持HALF_YEAR半年和YEAR年两个选项)，生效与本结构的购买数量(duration_quantity)结合使用，如购买3个HALF_YEAR表示一年半。
	 */
	@ApiField("duration_unit")
	private String durationUnit;

	/**
	 * null
	 */
	@ApiListField("exclude_license_list")
	@ApiField("string")
	private List<String> excludeLicenseList;

	/**
	 * 企信侧默认开启营销活动，如购买权益时长满一年送90天，不参与活动要显式设置为false
	 */
	@ApiField("has_activity")
	private Boolean hasActivity;

	/**
	 * 需要小于或者等于当前权益包的license数量，例如现在有15个license，有3个不需要续约，则需要传入12，同时在exclude_license_list指定不续约的license
	 */
	@ApiField("license_num")
	private Long licenseNum;

	/**
	 * 订单编号，是指伙伴的正式向企信提交订单后，拿到的一个唯一的不重复订单号，届时伙伴的财务打款时需要附上该订单号，方便做资金流和订单的匹配
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务ID,在调用本接口中需要保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 会员包编码
	 */
	@ApiField("package_id")
	private String packageId;

	public Long getDurationQuantity() {
		return this.durationQuantity;
	}
	public void setDurationQuantity(Long durationQuantity) {
		this.durationQuantity = durationQuantity;
	}

	public String getDurationUnit() {
		return this.durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public List<String> getExcludeLicenseList() {
		return this.excludeLicenseList;
	}
	public void setExcludeLicenseList(List<String> excludeLicenseList) {
		this.excludeLicenseList = excludeLicenseList;
	}

	public Boolean getHasActivity() {
		return this.hasActivity;
	}
	public void setHasActivity(Boolean hasActivity) {
		this.hasActivity = hasActivity;
	}

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
