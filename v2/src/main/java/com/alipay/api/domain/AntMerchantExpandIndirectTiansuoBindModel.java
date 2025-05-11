package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间连天梭绑定接口
 *
 * @author auto create
 * @since 1.0, 2025-04-27 14:28:45
 */
public class AntMerchantExpandIndirectTiansuoBindModel extends AlipayObject {

	private static final long serialVersionUID = 8455358377794193931L;

	/**
	 * 间连天梭绑定isv列表
	 */
	@ApiListField("tiansuo_isv_bind_list")
	@ApiField("tiansuo_isv_bind_v_o")
	private List<TiansuoIsvBindVO> tiansuoIsvBindList;

	public List<TiansuoIsvBindVO> getTiansuoIsvBindList() {
		return this.tiansuoIsvBindList;
	}
	public void setTiansuoIsvBindList(List<TiansuoIsvBindVO> tiansuoIsvBindList) {
		this.tiansuoIsvBindList = tiansuoIsvBindList;
	}

}
