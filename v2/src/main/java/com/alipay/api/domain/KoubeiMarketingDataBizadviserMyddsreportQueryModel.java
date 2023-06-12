package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * mydds 数据服务处理器
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:57:59
 */
public class KoubeiMarketingDataBizadviserMyddsreportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2613184996412659956L;

	/**
	 * req_parameters是请求参数汇集的一个json串和格式如下；
json串里需要传两个参数：shopId：门店Id 
memberType会员类型，1:会员、2:潜客。
"req_parameters": [{
          "paramKey": "shopId",
          "paramValue": "门店Id 的值"
          },{
          "paramKey": "memberType",
          "paramValue": "1"
          }]
	 */
	@ApiField("req_parameters")
	private String reqParameters;

	/**
	 * uniq_key 为请求类型，传值为shopMemberHeatmap时查询门店会员/潜在会员 热力图数据；
	 */
	@ApiField("uniq_key")
	private String uniqKey;

	public String getReqParameters() {
		return this.reqParameters;
	}
	public void setReqParameters(String reqParameters) {
		this.reqParameters = reqParameters;
	}

	public String getUniqKey() {
		return this.uniqKey;
	}
	public void setUniqKey(String uniqKey) {
		this.uniqKey = uniqKey;
	}

}
