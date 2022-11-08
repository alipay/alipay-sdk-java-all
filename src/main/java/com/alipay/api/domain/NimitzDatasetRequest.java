package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Nimitz Dataset 请求
 *
 * @author auto create
 * @since 1.0, 2022-06-13 17:00:16
 */
public class NimitzDatasetRequest extends AlipayObject {

	private static final long serialVersionUID = 6191418898889844452L;

	/**
	 * 返回字段
	 */
	@ApiListField("fields")
	@ApiField("string")
	private List<String> fields;

	/**
	 * 普通维度
	 */
	@ApiListField("individual_dim_keys")
	@ApiField("k_v_obj")
	private List<KVObj> individualDimKeys;

	/**
	 * obj维度，业务层面定义，选品中的品
	 */
	@ApiListField("obj_dim_keys")
	@ApiField("string")
	private List<String> objDimKeys;

	/**
	 * 分页条件
	 */
	@ApiField("page_cond")
	private NimitzPageCond pageCond;

	/**
	 * 时序维度
	 */
	@ApiField("range_cond")
	private NimitzRangeCond rangeCond;

	/**
	 * 是否逆序
	 */
	@ApiField("reversed")
	private Boolean reversed;

	/**
	 * 全局唯一
table数据标识，这里代表dataSet，以DS_开头
	 */
	@ApiField("rs_dataset")
	private String rsDataset;

	public List<String> getFields() {
		return this.fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<KVObj> getIndividualDimKeys() {
		return this.individualDimKeys;
	}
	public void setIndividualDimKeys(List<KVObj> individualDimKeys) {
		this.individualDimKeys = individualDimKeys;
	}

	public List<String> getObjDimKeys() {
		return this.objDimKeys;
	}
	public void setObjDimKeys(List<String> objDimKeys) {
		this.objDimKeys = objDimKeys;
	}

	public NimitzPageCond getPageCond() {
		return this.pageCond;
	}
	public void setPageCond(NimitzPageCond pageCond) {
		this.pageCond = pageCond;
	}

	public NimitzRangeCond getRangeCond() {
		return this.rangeCond;
	}
	public void setRangeCond(NimitzRangeCond rangeCond) {
		this.rangeCond = rangeCond;
	}

	public Boolean getReversed() {
		return this.reversed;
	}
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}

	public String getRsDataset() {
		return this.rsDataset;
	}
	public void setRsDataset(String rsDataset) {
		this.rsDataset = rsDataset;
	}

}
