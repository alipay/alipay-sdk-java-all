package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 喜气红包二维码码组详情
 *
 * @author auto create
 * @since 1.0, 2023-08-14 11:23:20
 */
public class GiftCodeGroupDetail extends AlipayObject {

	private static final long serialVersionUID = 7562834654753662741L;

	/**
	 * 当前码组关联的所有码详情
	 */
	@ApiListField("gift_code_detail_list")
	@ApiField("gift_code_detail")
	private List<GiftCodeDetail> giftCodeDetailList;

	/**
	 * 唯一标识，用来标识唯一一组码
	 */
	@ApiField("id")
	private String id;

	public List<GiftCodeDetail> getGiftCodeDetailList() {
		return this.giftCodeDetailList;
	}
	public void setGiftCodeDetailList(List<GiftCodeDetail> giftCodeDetailList) {
		this.giftCodeDetailList = giftCodeDetailList;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
