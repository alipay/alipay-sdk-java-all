package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开发者配置意图数据
 *
 * @author auto create
 * @since 1.0, 2019-02-12 14:53:21
 */
public class AlipayOpenMiniSetintentiondataSetModel extends AlipayObject {

	private static final long serialVersionUID = 2191424532678541445L;

	/**
	 * 本次更新动作类型,put:新增或覆盖,remove:删除
	 */
	@ApiField("action")
	private String action;

	/**
	 * 当前批次的唯一编号,对应本批次上传的多条意图数据，开发者自定义
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 用于标识数据所属的服务类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 推送到服务库的数据列表,json array格式的字符串
	 */
	@ApiField("data")
	private String data;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
