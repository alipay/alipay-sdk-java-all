package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 李韬测试接口01
 *
 * @author auto create
 * @since 1.0, 2018-05-24 10:56:07
 */
public class AlipayMarketingTestTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7528977623867996687L;

	/**
	 * 11
	 */
	@ApiField("data")
	private String data;

	/**
	 * 4
	 */
	@ApiField("form_id")
	private String formId;

	/**
	 * 1
	 */
	@ApiListField("image_id")
	@ApiField("string")
	private List<String> imageId;

	/**
	 * 4
	 */
	@ApiField("page")
	private String page;

	/**
	 * 33333333333333333333333333333333333333333333333333333333333333333333333333333333333333
	 */
	@ApiListField("test")
	@ApiField("xwb_test_data")
	private List<XwbTestData> test;

	/**
	 * 3
	 */
	@ApiField("to_user_id")
	private String toUserId;

	/**
	 * 3
	 */
	@ApiField("user_template_id")
	private String userTemplateId;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getFormId() {
		return this.formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}

	public List<String> getImageId() {
		return this.imageId;
	}
	public void setImageId(List<String> imageId) {
		this.imageId = imageId;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public List<XwbTestData> getTest() {
		return this.test;
	}
	public void setTest(List<XwbTestData> test) {
		this.test = test;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getUserTemplateId() {
		return this.userTemplateId;
	}
	public void setUserTemplateId(String userTemplateId) {
		this.userTemplateId = userTemplateId;
	}

}
