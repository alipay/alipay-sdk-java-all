package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据集同步
 *
 * @author auto create
 * @since 1.0, 2021-08-24 19:47:59
 */
public class AlipayDataDataserviceAdDatasetSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5868951421643171566L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 数据集外部标志，不允许重复
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据集外部名称
	 */
	@ApiField("data_name")
	private String dataName;

	/**
	 * 数据源类型类型:
LOCAL_MEMBER-本地生活会员数据
LOCAL_COUPON-本地生活优惠券数据
LOCAL_TRANSACTION-本地生活订单数据
	 */
	@ApiField("data_src_type")
	private String dataSrcType;

	/**
	 * 数据所属增量同步odps表名
	 */
	@ApiField("data_table_name")
	private String dataTableName;

	/**
	 * 数据类型：CONVERSION_DATA-转化数据
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 商户id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 商户在支付宝灯火pb侧的唯一标志
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 状态: ENABLE-有效; DISABLE-失效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户唯一标志类型: PID-支付宝pid
	 */
	@ApiField("user_unique_type")
	private String userUniqueType;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataName() {
		return this.dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataSrcType() {
		return this.dataSrcType;
	}
	public void setDataSrcType(String dataSrcType) {
		this.dataSrcType = dataSrcType;
	}

	public String getDataTableName() {
		return this.dataTableName;
	}
	public void setDataTableName(String dataTableName) {
		this.dataTableName = dataTableName;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserUniqueType() {
		return this.userUniqueType;
	}
	public void setUserUniqueType(String userUniqueType) {
		this.userUniqueType = userUniqueType;
	}

}
