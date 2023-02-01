/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.spikeysanju.wiggles.data

import dev.spikeysanju.wiggles.model.Dog
import dev.spikeysanju.wiggles.model.Image.*
import dev.spikeysanju.wiggles.model.Owner

object FakeDogDatabase {
    val owner = Owner("Spikey Sanju", "Developer & Pet Lover", DOG_OWNER)
    val dogList = listOf(
        Dog(
            0,
            "Hachiko",
            3.5,
            "Male",
            "Brown",
            12.9,
            "389m away",
            ORANGE_DOG,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            1,
            "Skooby Doo",
            3.5,
            "Male",
            "Gold",
            12.4,
            "412m away",
            BLUE_DOG,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            2,
            "Miss Agnes",
            3.5,
            "Female",
            "White",
            9.6,
            "879m away",
            RED_DOG,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            3,
            "Cyrus",
            3.5,
            "Male",
            "Black",
            8.2,
            "672m away",
            YELLOW_DOG,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            4,
            "Shelby",
            3.5,
            "Female",
            "Choco",
            14.9,
            "982m away",
            WHITE_DOG,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        )
    )
}
