package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiQualityTestCloudacptItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7352537681296269659L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/** 
	 * 批次状态
0，未检测
1，检测中
2，未通过
3，已通过
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 失败单品书列表
	 */
	@ApiListField("fail_list")
	@ApiField("open_item")
	private List<OpenItem> failList;

	/** 
	 * 失败数
	 */
	@ApiField("fail_num")
	private String failNum;

	/** 
	 * 单品列表
	 */
	@ApiListField("item_list")
	@ApiField("open_item")
	private List<OpenItem> itemList;

	/** 
	 * 单品数
	 */
	@ApiField("item_num")
	private String itemNum;

	/** 
	 * 通过单品列表
	 */
	@ApiListField("pass_list")
	@ApiField("open_item")
	private List<OpenItem> passList;

	/** 
	 * 通过数
	 */
	@ApiField("pass_num")
	private String passNum;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId( ) {
		return this.batchId;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

	public void setFailList(List<OpenItem> failList) {
		this.failList = failList;
	}
	public List<OpenItem> getFailList( ) {
		return this.failList;
	}

	public void setFailNum(String failNum) {
		this.failNum = failNum;
	}
	public String getFailNum( ) {
		return this.failNum;
	}

	public void setItemList(List<OpenItem> itemList) {
		this.itemList = itemList;
	}
	public List<OpenItem> getItemList( ) {
		return this.itemList;
	}

	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}
	public String getItemNum( ) {
		return this.itemNum;
	}

	public void setPassList(List<OpenItem> passList) {
		this.passList = passList;
	}
	public List<OpenItem> getPassList( ) {
		return this.passList;
	}

	public void setPassNum(String passNum) {
		this.passNum = passNum;
	}
	public String getPassNum( ) {
		return this.passNum;
	}

}
