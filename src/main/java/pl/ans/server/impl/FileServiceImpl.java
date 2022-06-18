package pl.ans.server.impl;

import pl.ans.server.model.DocumentComponent;
import pl.ans.server.quiz.Answer;
import pl.ans.server.dto.FileData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileServiceImpl.class);

    @Autowired
    private DocumentComponent documentComponent;

    @Override
    public FileData createFile(List<Answer> answers, String path) {
        String fileName = "raport_końcowy" + ".pdf";
        String fileDestination = path + fileName;

        try {

            Files.createDirectories(Paths.get(path));
            documentComponent.createDocument(answers, fileDestination);

        } catch (IOException e) {
            LOGGER.error("i can't save data");
        }

        return null;
    }
}

