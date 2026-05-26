package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 厂商非sdk设备链接变更
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:28:14
 */
public class AlipayCommerceIotManufacturerUrlModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6139731733121426117L;

	/**
	 * 模块变更详情
	 */
	@ApiListField("items")
	@ApiField("tag_url_modify_info")
	private List<TagUrlModifyInfo> items;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public List<TagUrlModifyInfo> getItems() {
		return this.items;
	}
	public void setItems(List<TagUrlModifyInfo> items) {
		this.items = items;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
