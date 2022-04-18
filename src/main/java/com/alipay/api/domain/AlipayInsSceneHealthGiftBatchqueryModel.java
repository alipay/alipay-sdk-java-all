package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健康险赠险权益批量查询接口
 *
 * @author auto create
 * @since 1.0, 2020-10-28 16:44:37
 */
public class AlipayInsSceneHealthGiftBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8672466353864298722L;

	/**
	 * 赠险业务标志 HEALTH_BEAN_SIMPLE_UPGRADE 免费医疗金、HEALTH_GUARDIAN_GOLD 守护金、HEALTH_DSDB_NEW_OUTPATIENT 多收多宝新门诊
	 */
	@ApiListField("biz_type_list")
	@ApiField("string")
	private List<String> bizTypeList;

	/**
	 * 查询某渠道记录的起期，注意，只对health_send_flow_list、health_gain_flow_list字段生效
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * health_gift_batch_gain_sum_insured_list	健康险赠险待领取权益，目前包含待领取保额，准入
health_gift_batch_valid_gift_list	用户生效赠险查询结果
health_gift_batch_already_opened_list	健康险赠险险种是否已开通查询结果
health_gift_batch_my_sum_insured_list	健康险赠险用户总保额查询结果
health_send_flow_list	赠险发放流水列表
health_gain_flow_list	赠险领取流水列表
gained_sum_insured_by_source 赠险从某个source领取的保额
	 */
	@ApiListField("operation_list")
	@ApiField("string")
	private List<String> operationList;

	/**
	 * 赠险产品组类型。 赠险通用产品组 COMMON_GIFT_INSURANCE_PRODUCT_GROUP、 C端赠险产品组 CUSTOMER_GIFT_INSURANCE_PRODUCT_GROUP、 B端赠险产品组 BUSINESS_GIFT_INSURANCE_PRODUCT_GROUP、 相互保赠险产品组 XHB_GIFT_INSURANCE_PRODUCT_GROUP
	 */
	@ApiListField("product_group_biz_type_list")
	@ApiField("string")
	private List<String> productGroupBizTypeList;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 查询某渠道记录的起期，注意，只对health_send_flow_list、health_gain_flow_list字段生效
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getBizTypeList() {
		return this.bizTypeList;
	}
	public void setBizTypeList(List<String> bizTypeList) {
		this.bizTypeList = bizTypeList;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<String> getOperationList() {
		return this.operationList;
	}
	public void setOperationList(List<String> operationList) {
		this.operationList = operationList;
	}

	public List<String> getProductGroupBizTypeList() {
		return this.productGroupBizTypeList;
	}
	public void setProductGroupBizTypeList(List<String> productGroupBizTypeList) {
		this.productGroupBizTypeList = productGroupBizTypeList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
