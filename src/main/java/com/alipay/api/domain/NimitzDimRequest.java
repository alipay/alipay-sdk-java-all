package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Nimitz 维度查询请求
 *
 * @author auto create
 * @since 1.0, 2022-06-13 17:00:27
 */
public class NimitzDimRequest extends AlipayObject {

	private static final long serialVersionUID = 3793393495888614883L;

	/**
	 * 返回字段
	 */
	@ApiListField("fields")
	@ApiField("string")
	private List<String> fields;

	/**
	 * KV检索，类比sql语句where条件中的in
	 */
	@ApiListField("kv_attributes")
	@ApiField("k_v_obj")
	private List<KVObj> kvAttributes;

	/**
	 * 分页条件
	 */
	@ApiField("page_cond")
	private NimitzPageCond pageCond;

	/**
	 * 区间检索，类比于sql语句where条件中的between and
	 */
	@ApiListField("range_attributes")
	@ApiField("nimitz_range_cond")
	private List<NimitzRangeCond> rangeAttributes;

	/**
	 * dim和dataset均称之为rsData，dim以DM_开头，dataset以DS_开头
	 */
	@ApiField("rs_dataset")
	private String rsDataset;

	public List<String> getFields() {
		return this.fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<KVObj> getKvAttributes() {
		return this.kvAttributes;
	}
	public void setKvAttributes(List<KVObj> kvAttributes) {
		this.kvAttributes = kvAttributes;
	}

	public NimitzPageCond getPageCond() {
		return this.pageCond;
	}
	public void setPageCond(NimitzPageCond pageCond) {
		this.pageCond = pageCond;
	}

	public List<NimitzRangeCond> getRangeAttributes() {
		return this.rangeAttributes;
	}
	public void setRangeAttributes(List<NimitzRangeCond> rangeAttributes) {
		this.rangeAttributes = rangeAttributes;
	}

	public String getRsDataset() {
		return this.rsDataset;
	}
	public void setRsDataset(String rsDataset) {
		this.rsDataset = rsDataset;
	}

}
