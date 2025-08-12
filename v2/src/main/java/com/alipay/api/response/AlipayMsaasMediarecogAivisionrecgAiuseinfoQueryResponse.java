package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TipIotDeepeyeSnackRecognizePageResVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aivisionrecg.aiuseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-11 16:37:37
 */
public class AlipayMsaasMediarecogAivisionrecgAiuseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8222844773352312928L;

	/** 
	 * 当前页
	 */
	@ApiField("current")
	private Long current;

	/** 
	 * AI秤-零食场景-识别结果输出
	 */
	@ApiListField("data_list")
	@ApiField("tip_iot_deepeye_snack_recognize_page_res_vo")
	private List<TipIotDeepeyeSnackRecognizePageResVo> dataList;

	/** 
	 * 每页显示条数，默认 10
	 */
	@ApiField("size")
	private Long size;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setCurrent(Long current) {
		this.current = current;
	}
	public Long getCurrent( ) {
		return this.current;
	}

	public void setDataList(List<TipIotDeepeyeSnackRecognizePageResVo> dataList) {
		this.dataList = dataList;
	}
	public List<TipIotDeepeyeSnackRecognizePageResVo> getDataList( ) {
		return this.dataList;
	}

	public void setSize(Long size) {
		this.size = size;
	}
	public Long getSize( ) {
		return this.size;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
