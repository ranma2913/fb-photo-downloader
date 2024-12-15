package com.ranma2913.fbphotodownloader

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = 'fb-photo-downloader')
class PhotoDownloaderProps {
    BrowserName browser

    enum BrowserName {
        FIREFOX, CHROME, EDGE
    }
}
