package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 领取赠险用户的权益
 *
 * @author auto create
 * @since 1.0, 2019-11-25 13:02:33
 */
public class AlipayInsSceneHealthGiftAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 3624179682893913377L;

	/**
	 * 赠险业务标志 HEALTH_BEAN_SIMPLE_UPGRADE 免费医疗金、HEALTH_GUARDIAN_GOLD 守护金、HEALTH_DSDB_NEW_OUTPATIENT 多收多宝新门诊
	 */
	@ApiListField("biz_type_list")
	@ApiField("string")
	private List<String> bizTypeList;

	/**
	 * 赠险产品组类型。 赠险通用产品组 COMMON_GIFT_INSURANCE_PRODUCT_GROUP、 C端赠险产品组 CUSTOMER_GIFT_INSURANCE_PRODUCT_GROUP、 B端赠险产品组 BUSINESS_GIFT_INSURANCE_PRODUCT_GROUP
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
