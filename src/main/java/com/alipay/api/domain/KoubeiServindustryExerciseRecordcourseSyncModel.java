package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健身课程日志同步接口
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:51:22
 */
public class KoubeiServindustryExerciseRecordcourseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5842745942636697315L;

	/**
	 * 数据版本号。linux时间戳，到毫秒级别。如果同步数据的版本号小于口碑服务器已有数据的版本号，则会被丢弃。
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 口碑用户健身唯一ID，和支付宝userId一一对应
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/**
	 * 健身记录列表，每个记录是一天的全量课程记录
	 */
	@ApiListField("record_list")
	@ApiField("exercise_record_open_model")
	private List<ExerciseRecordOpenModel> recordList;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getFitnessId() {
		return this.fitnessId;
	}
	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}

	public List<ExerciseRecordOpenModel> getRecordList() {
		return this.recordList;
	}
	public void setRecordList(List<ExerciseRecordOpenModel> recordList) {
		this.recordList = recordList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
