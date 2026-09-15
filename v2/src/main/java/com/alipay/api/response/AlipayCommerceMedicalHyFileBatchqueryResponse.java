package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HyFileMeta;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hy.file.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-31 16:07:53
 */
public class AlipayCommerceMedicalHyFileBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7345541432753636638L;

	/** 
	 * null
	 */
	@ApiListField("file_list")
	@ApiField("hy_file_meta")
	private List<HyFileMeta> fileList;

	/** 
	 * null
	 */
	@ApiListField("image_list")
	@ApiField("hy_file_meta")
	private List<HyFileMeta> imageList;

	/** 
	 * null
	 */
	@ApiListField("video_list")
	@ApiField("hy_file_meta")
	private List<HyFileMeta> videoList;

	public void setFileList(List<HyFileMeta> fileList) {
		this.fileList = fileList;
	}
	public List<HyFileMeta> getFileList( ) {
		return this.fileList;
	}

	public void setImageList(List<HyFileMeta> imageList) {
		this.imageList = imageList;
	}
	public List<HyFileMeta> getImageList( ) {
		return this.imageList;
	}

	public void setVideoList(List<HyFileMeta> videoList) {
		this.videoList = videoList;
	}
	public List<HyFileMeta> getVideoList( ) {
		return this.videoList;
	}

}
