package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券优惠门槛信息
 *
 * @author auto create
 * @since 1.0, 2023-11-01 19:38:07
 */
public class VoucherDeductThresholdInfo extends AlipayObject {

	private static final long serialVersionUID = 5433693831892842777L;

	/**
	 * 自定义门槛描述
	 */
	@ApiField("customer_define_voucher_threshold_desc")
	private String customerDefineVoucherThresholdDesc;

	/**
	 * 邮费信息
	 */
	@ApiField("voucher_express_info")
	private VoucherExpressInfo voucherExpressInfo;

	/**
	 * 商品规格信息，数量，尺寸，大小等
	 */
	@ApiField("voucher_goods_quantity_specification_info")
	private VoucherGoodsQuantitySpecificationInfo voucherGoodsQuantitySpecificationInfo;

	public String getCustomerDefineVoucherThresholdDesc() {
		return this.customerDefineVoucherThresholdDesc;
	}
	public void setCustomerDefineVoucherThresholdDesc(String customerDefineVoucherThresholdDesc) {
		this.customerDefineVoucherThresholdDesc = customerDefineVoucherThresholdDesc;
	}

	public VoucherExpressInfo getVoucherExpressInfo() {
		return this.voucherExpressInfo;
	}
	public void setVoucherExpressInfo(VoucherExpressInfo voucherExpressInfo) {
		this.voucherExpressInfo = voucherExpressInfo;
	}

	public VoucherGoodsQuantitySpecificationInfo getVoucherGoodsQuantitySpecificationInfo() {
		return this.voucherGoodsQuantitySpecificationInfo;
	}
	public void setVoucherGoodsQuantitySpecificationInfo(VoucherGoodsQuantitySpecificationInfo voucherGoodsQuantitySpecificationInfo) {
		this.voucherGoodsQuantitySpecificationInfo = voucherGoodsQuantitySpecificationInfo;
	}

}
