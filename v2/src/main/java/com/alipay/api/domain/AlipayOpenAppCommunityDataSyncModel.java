package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 社区生活社区素材内容上传
 *
 * @author auto create
 * @since 1.0, 2019-12-03 14:41:59
 */
public class AlipayOpenAppCommunityDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1756155836589713865L;

	/**
	 * 操作类型.PUT:新增或覆盖,REMOVE:删除
	 */
	@ApiField("action")
	private String action;

	/**
	 * 上传数据批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 用于标识数据所属数据类目
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 上传数据列表
	 */
	@ApiListField("data_list")
	@ApiField("biz_data")
	private List<BizData> dataList;

	/**
	 * 社区素材内容数据类型
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

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<BizData> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<BizData> dataList) {
		this.dataList = dataList;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
