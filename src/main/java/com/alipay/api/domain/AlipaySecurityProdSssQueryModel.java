package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 金柚测试3.0接口
 *
 * @author auto create
 * @since 1.0, 2022-11-03 20:14:49
 */
public class AlipaySecurityProdSssQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4111915945734895361L;

	/**
	 * 1
	 */
	@ApiField("aaa")
	private String aaa;

	/**
	 * 1
	 */
	@ApiField("aaa_open_id")
	private String aaaOpenId;

	/**
	 * activity_id 词条描述
	 */
	@ApiField("bbb")
	private String bbb;

	/**
	 * stst
	 */
	@ApiListField("tesst")
	@ApiField("promise_detail")
	private List<PromiseDetail> tesst;

	/**
	 * 111
	 */
	@ApiField("xxx")
	private JinyouTestFive xxx;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public String getAaaOpenId() {
		return this.aaaOpenId;
	}
	public void setAaaOpenId(String aaaOpenId) {
		this.aaaOpenId = aaaOpenId;
	}

	public String getBbb() {
		return this.bbb;
	}
	public void setBbb(String bbb) {
		this.bbb = bbb;
	}

	public List<PromiseDetail> getTesst() {
		return this.tesst;
	}
	public void setTesst(List<PromiseDetail> tesst) {
		this.tesst = tesst;
	}

	public JinyouTestFive getXxx() {
		return this.xxx;
	}
	public void setXxx(JinyouTestFive xxx) {
		this.xxx = xxx;
	}

}
