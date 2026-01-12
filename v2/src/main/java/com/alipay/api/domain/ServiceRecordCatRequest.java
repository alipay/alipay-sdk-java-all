package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务记录类目请求
 *
 * @author auto create
 * @since 1.0, 2020-12-10 16:49:01
 */
public class ServiceRecordCatRequest extends AlipayObject {

	private static final long serialVersionUID = 7557614363162484574L;

	/**
	 * 类目名称(需要每一级用;分隔封装)
	 */
	@ApiField("cat_name")
	private String catName;

	/**
	 * 一级类目编码
	 */
	@ApiField("first_cat")
	private String firstCat;

	/**
	 * 四级类目编码
	 */
	@ApiField("fourth_cat")
	private String fourthCat;

	/**
	 * 类目树编码
	 */
	@ApiField("instence_code")
	private String instenceCode;

	/**
	 * 二级类目编码
	 */
	@ApiField("second_cat")
	private String secondCat;

	/**
	 * 三级类目编码
	 */
	@ApiField("third_cat")
	private String thirdCat;

	public String getCatName() {
		return this.catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getFirstCat() {
		return this.firstCat;
	}
	public void setFirstCat(String firstCat) {
		this.firstCat = firstCat;
	}

	public String getFourthCat() {
		return this.fourthCat;
	}
	public void setFourthCat(String fourthCat) {
		this.fourthCat = fourthCat;
	}

	public String getInstenceCode() {
		return this.instenceCode;
	}
	public void setInstenceCode(String instenceCode) {
		this.instenceCode = instenceCode;
	}

	public String getSecondCat() {
		return this.secondCat;
	}
	public void setSecondCat(String secondCat) {
		this.secondCat = secondCat;
	}

	public String getThirdCat() {
		return this.thirdCat;
	}
	public void setThirdCat(String thirdCat) {
		this.thirdCat = thirdCat;
	}

}
