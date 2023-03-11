package com.gma.gmagame.model;

import lombok.Data;

@Data
public class BoardFile {
    private Integer idx;
    private Integer boardIdx;
    private String originalFileName;
    private String storedFilePath;
    private Long fileSize;
    BoardFile(Integer idx,Integer boardIdx,String originalFileName,String storedFilePath,Long fileSize)
    {
        this.idx=idx;
        this.boardIdx=boardIdx;
        this.originalFileName=originalFileName;
        this.storedFilePath=storedFilePath;
        this.fileSize=fileSize;
    }
}