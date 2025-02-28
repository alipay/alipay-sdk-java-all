package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘行为分析数据
 *
 * @author auto create
 * @since 1.0, 2023-01-12 20:55:03
 */
public class MultiDataOpenResult extends AlipayObject {

	private static final long serialVersionUID = 5618576873381938429L;

	/**
	 * 所有区间对应的用户平均数量
	 */
	@ApiField("avg_num")
	private String avgNum;

	/**
	 * 数据区间分布横轴
	 */
	@ApiField("feature_key")
	private String featureKey;

	/**
	 * 主体id，如小程序appid
	 */
	@ApiField("object_id")
	private String objectId;

	/**
	 * 主体名称，如小程序名称
	 */
	@ApiField("object_name")
	private String objectName;

	/**
	 * 主体类型
	 */
	@ApiField("object_type")
	private String objectType;

	/**
	 * 区间对应的用户数量
	 */
	@ApiField("user_cnt")
	private String userCnt;

	/**
	 * 区间对应的用户比例
	 */
	@ApiField("user_ratio")
	private String userRatio;

	public String getAvgNum() {
		return this.avgNum;
	}
	public void setAvgNum(String avgNum) {
		this.avgNum = avgNum;
	}

	public String getFeatureKey() {
		return this.featureKey;
	}
	public void setFeatureKey(String featureKey) {
		this.featureKey = featureKey;
	}

	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getObjectName() {
		return this.objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectType() {
		return this.objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getUserCnt() {
		return this.userCnt;
	}
	public void setUserCnt(String userCnt) {
		this.userCnt = userCnt;
	}

	public String getUserRatio() {
		return this.userRatio;
	}
	public void setUserRatio(String userRatio) {
		this.userRatio = userRatio;
	}

}
