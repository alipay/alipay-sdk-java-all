package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广详情
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertAdvResponse extends AlipayObject {

	private static final long serialVersionUID = 5441141259845918226L;

	/**
	 * 广告ID
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 指定推广活动的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单张券推广
只有type=single_voucher才会有值
	 */
	@ApiField("single_voucher")
	private KbAdvertAdvSingleVoucherResponse singleVoucher;

	/**
	 * 推广类型
	 */
	@ApiField("type")
	private String type;

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public KbAdvertAdvSingleVoucherResponse getSingleVoucher() {
		return this.singleVoucher;
	}
	public void setSingleVoucher(KbAdvertAdvSingleVoucherResponse singleVoucher) {
		this.singleVoucher = singleVoucher;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
