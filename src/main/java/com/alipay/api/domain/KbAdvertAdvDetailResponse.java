package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告模型
 *
 * @author auto create
 * @since 1.0, 2017-07-05 16:27:49
 */
public class KbAdvertAdvDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 3443394132849998948L;

	/**
	 * 广告内容详情说明
	 */
	@ApiField("adv_content_list")
	private KbAdvertAdvContentDetailResponse advContentList;

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
	 * single_voucher：券广告
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券信息
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucherDetailResponse voucher;

	public KbAdvertAdvContentDetailResponse getAdvContentList() {
		return this.advContentList;
	}
	public void setAdvContentList(KbAdvertAdvContentDetailResponse advContentList) {
		this.advContentList = advContentList;
	}

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public KbAdvertSubjectVoucherDetailResponse getVoucher() {
		return this.voucher;
	}
	public void setVoucher(KbAdvertSubjectVoucherDetailResponse voucher) {
		this.voucher = voucher;
	}

}
