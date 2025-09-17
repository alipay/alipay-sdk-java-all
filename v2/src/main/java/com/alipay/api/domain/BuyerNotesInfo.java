package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品购买须知数据结构。
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class BuyerNotesInfo extends AlipayObject {

	private static final long serialVersionUID = 7299922446453555533L;

	/**
	 * 标题下的描述列表，列表类型，每项不得为空,最多10项，总长度不能超过2600个中文字符
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 描述标题，不得超过15个中文字符
	 */
	@ApiField("title")
	private String title;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
