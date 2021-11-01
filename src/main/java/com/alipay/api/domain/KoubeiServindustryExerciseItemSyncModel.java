package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运动项目同步
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:53:10
 */
public class KoubeiServindustryExerciseItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5535399365656544123L;

	/**
	 * linux时间戳
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 健身项目列表
	 */
	@ApiListField("item_list")
	@ApiField("exercise_item")
	private List<ExerciseItem> itemList;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public List<ExerciseItem> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ExerciseItem> itemList) {
		this.itemList = itemList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
