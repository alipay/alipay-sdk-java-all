package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组数目统计接口
 *
 * @author auto create
 * @since 1.0, 2017-07-26 11:31:28
 */
public class KoubeiMarketingCampaignCrowdCountModel extends AlipayObject {

	private static final long serialVersionUID = 6682521488425813319L;

	/**
	 * 圈人的条件
op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
value:标签值
	 */
	@ApiField("conditions")
	private String conditions;

	/**
	 * crowd_group_id和conditions不能同时为空
如果crowd_group_id不为空则根据crowd_group_id查询人群分组的信息进行统计，否则以conditions的内容为过滤条件进行统计，如果crowd_group_id和conditions都不为空则优先使用conditions的条件
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 画像分析的维度，目前支持:["pam_age","pam_gender","pam_constellation","pam_hometown_code","pam_city_code","pam_occupation","pam_consume_level","pam_have_baby"]，以koubei.marketing.campaign.tags.query接口返回的dimensions为准，各个维度标签的详细信息参见附件，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
	 */
	@ApiField("dimensions")
	private String dimensions;

	public String getConditions() {
		return this.conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

	public String getDimensions() {
		return this.dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

}
