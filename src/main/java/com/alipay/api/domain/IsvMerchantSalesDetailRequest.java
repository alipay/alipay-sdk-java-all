package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * S1回传商户销售数据时，回传使用的对象
 *
 * @author auto create
 * @since 1.0, 2021-11-01 19:42:50
 */
public class IsvMerchantSalesDetailRequest extends AlipayObject {

	private static final long serialVersionUID = 6553951634861645183L;

	/**
	 * 配券数
	 */
	@ApiField("coupons_quantity")
	private String couponsQuantity;

	/**
	 * 设备详情
	 */
	@ApiField("device_detail")
	private String deviceDetail;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小程序appid，若推广的商品不为小程序，则不传此参数
	 */
	@ApiField("mini_appid")
	private String miniAppid;

	/**
	 * 作业地
	 */
	@ApiField("operation_place")
	private String operationPlace;

	/**
	 * 外部业务号，传isv系统生成的账单号，需要保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 推广服务商(S2)pid
	 */
	@ApiField("promotor_pid")
	private String promotorPid;

	/**
	 * 销售金额，这里填写的是整数，单位为分，比如1元，那么输入100
	 */
	@ApiField("sales_amount")
	private String salesAmount;

	/**
	 * 销售笔数
	 */
	@ApiField("sales_quantity")
	private String salesQuantity;

	/**
	 * 推广服务商(S2)子账号pid
	 */
	@ApiField("sub_promotor_pid")
	private String subPromotorPid;

	/**
	 * 核销金额，这里填写的是整数，单位为分，比如1元，那么输入100
	 */
	@ApiField("write_off_amount")
	private String writeOffAmount;

	/**
	 * 核销数
	 */
	@ApiField("write_off_quantity")
	private String writeOffQuantity;

	public String getCouponsQuantity() {
		return this.couponsQuantity;
	}
	public void setCouponsQuantity(String couponsQuantity) {
		this.couponsQuantity = couponsQuantity;
	}

	public String getDeviceDetail() {
		return this.deviceDetail;
	}
	public void setDeviceDetail(String deviceDetail) {
		this.deviceDetail = deviceDetail;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMiniAppid() {
		return this.miniAppid;
	}
	public void setMiniAppid(String miniAppid) {
		this.miniAppid = miniAppid;
	}

	public String getOperationPlace() {
		return this.operationPlace;
	}
	public void setOperationPlace(String operationPlace) {
		this.operationPlace = operationPlace;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPromotorPid() {
		return this.promotorPid;
	}
	public void setPromotorPid(String promotorPid) {
		this.promotorPid = promotorPid;
	}

	public String getSalesAmount() {
		return this.salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

	public String getSalesQuantity() {
		return this.salesQuantity;
	}
	public void setSalesQuantity(String salesQuantity) {
		this.salesQuantity = salesQuantity;
	}

	public String getSubPromotorPid() {
		return this.subPromotorPid;
	}
	public void setSubPromotorPid(String subPromotorPid) {
		this.subPromotorPid = subPromotorPid;
	}

	public String getWriteOffAmount() {
		return this.writeOffAmount;
	}
	public void setWriteOffAmount(String writeOffAmount) {
		this.writeOffAmount = writeOffAmount;
	}

	public String getWriteOffQuantity() {
		return this.writeOffQuantity;
	}
	public void setWriteOffQuantity(String writeOffQuantity) {
		this.writeOffQuantity = writeOffQuantity;
	}

}
