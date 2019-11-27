package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmapPoi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.fangzhong.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppFangzhongGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2561155622134752323L;

	/** 
	 * 搜索方案数目(最大值为1000)
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 搜索POI信息列表
	 */
	@ApiListField("pois")
	@ApiField("amap_poi")
	private List<AmapPoi> pois;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setPois(List<AmapPoi> pois) {
		this.pois = pois;
	}
	public List<AmapPoi> getPois( ) {
		return this.pois;
	}

}
