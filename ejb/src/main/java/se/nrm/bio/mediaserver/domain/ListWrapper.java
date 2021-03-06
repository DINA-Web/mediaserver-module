/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.bio.mediaserver.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ingimar
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "header")
public class ListWrapper {

    private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "metadata")
    private final MetadataHeader metadata;
    
    @XmlAttribute(name = "data")
    private final List<Media> list;

    public ListWrapper(MetadataHeader metadata, List<Media> list) {
        this.metadata = metadata;
        this.list = list;
    }

    public List<Media> getList() {
        return list;
    }
    
    public MetadataHeader getMetadata() {
        return metadata;
    }
}