package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 吃呗额度查询请求数据结构
 *
 * @author auto create
 * @since 1.0, 2020-03-27 16:16:14
 */
public class TbapiQueryAmountBizContent extends AlipayObject {

	private static final long serialVersionUID = 1127198565499714534L;

	/**
	 * 查询指定额度产品组
	 */
	@ApiField("amt_group")
	private String amtGroup;

	/**
	 * 查询指定额度产品码
	 */
	@ApiListField("amt_prods")
	@ApiField("string")
	private List<String> amtProds;

	/**
	 * 请求来源
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 请求场景
	 */
	@ApiField("scene")
	private String scene;

	public String getAmtGroup() {
		return this.amtGroup;
	}
	public void setAmtGroup(String amtGroup) {
		this.amtGroup = amtGroup;
	}

	public List<String> getAmtProds() {
		return this.amtProds;
	}
	public void setAmtProds(List<String> amtProds) {
		this.amtProds = amtProds;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
