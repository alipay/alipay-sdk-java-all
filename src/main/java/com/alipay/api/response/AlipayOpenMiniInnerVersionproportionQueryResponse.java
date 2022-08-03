package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppxVersionConfigVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.versionproportion.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-14 11:41:45
 */
public class AlipayOpenMiniInnerVersionproportionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5244321924491829244L;

	/** 
	 * 查询基础版本库的结果
	 */
	@ApiListField("appx_version_config_vos")
	@ApiField("appx_version_config_vo")
	private List<AppxVersionConfigVo> appxVersionConfigVos;

	public void setAppxVersionConfigVos(List<AppxVersionConfigVo> appxVersionConfigVos) {
		this.appxVersionConfigVos = appxVersionConfigVos;
	}
	public List<AppxVersionConfigVo> getAppxVersionConfigVos( ) {
		return this.appxVersionConfigVos;
	}

}
