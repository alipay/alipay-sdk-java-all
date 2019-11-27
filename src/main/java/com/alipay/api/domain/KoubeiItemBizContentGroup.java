package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑商品内容组模型
 *
 * @author auto create
 * @since 1.0, 2017-07-17 19:03:13
 */
public class KoubeiItemBizContentGroup extends AlipayObject {

	private static final long serialVersionUID = 2645692671669457795L;

	/**
	 * 口碑商品内容组
	 */
	@ApiListField("content_details")
	@ApiField("koubei_item_biz_content_detail")
	private List<KoubeiItemBizContentDetail> contentDetails;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public List<KoubeiItemBizContentDetail> getContentDetails() {
		return this.contentDetails;
	}
	public void setContentDetails(List<KoubeiItemBizContentDetail> contentDetails) {
		this.contentDetails = contentDetails;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
