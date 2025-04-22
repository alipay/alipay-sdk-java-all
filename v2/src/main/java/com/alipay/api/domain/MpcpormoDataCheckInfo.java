package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回校验失败的信息
 *
 * @author auto create
 * @since 1.0, 2023-03-22 16:39:50
 */
public class MpcpormoDataCheckInfo extends AlipayObject {

	private static final long serialVersionUID = 3727722694937638443L;

	/**
	 * 校验信息
	 */
	@ApiField("check_info")
	private String checkInfo;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	public String getCheckInfo() {
		return this.checkInfo;
	}
	public void setCheckInfo(String checkInfo) {
		this.checkInfo = checkInfo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
