package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务业务能力数据上传
 *
 * @author auto create
 * @since 1.0, 2019-05-31 14:16:02
 */
public class AlipayOpenAppServiceBizabilitydataSetModel extends AlipayObject {

	private static final long serialVersionUID = 8534352182754156354L;

	/**
	 * 操作类型.PUT:新增或覆盖,REMOVE:删除
	 */
	@ApiField("action")
	private String action;

	/**
	 * 批次的唯一编号,对应本批次上传的多条意图数据，开发者自定义
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 用于标识数据所属的服务类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 推送到服务库的数据列表
	 */
	@ApiListField("data_list")
	@ApiField("biz_ability_data")
	private List<BizAbilityData> dataList;

	/**
	 * 服务业务能力数据类型，支持：ITEM_SUMMARY(商品摘要)、USER_INTENSION(用户意图数据)、FUNCTION(服务功能)
	 */
	@ApiField("type")
	private String type;

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

	public List<BizAbilityData> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<BizAbilityData> dataList) {
		this.dataList = dataList;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
